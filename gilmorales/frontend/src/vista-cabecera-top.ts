import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cabecera-top')
export class VistaCabeceraTop extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout id="cabeceraTop" style="flex-shrink: 0; flex-grow: 0; align-items: center; z-index: 999; height: 100%; justify-content: flex-start; overflow-y: auto; scrollbar-color: transparent transparent; padding-bottom: 5%; background-color: #C8C4C4; padding: var(--lumo-space-m);" theme="spacing-xs">
 <h4 id="tituloUsuarios" style="align-self: center; margin: 0px; margin-top: var(--lumo-space-m);">Top Usuarios</h4>
 <hr style="width: 100%; height: 2px;">
 <vaadin-vertical-layout id="listaUsuarios" style="margin: 0px; padding: 0px; align-items: center; align-self: center;" theme="spacing-xs"></vaadin-vertical-layout>
 <hr style="width: 100%; height: 2px;">
 <vaadin-button id="botonVerListaUsuarios" style="align-self: center;z-index: 2; " theme="primary contrast">
   Lista Usuarios 
 </vaadin-button>
 <h4 id="tituloHashtag">Top Hashtags</h4>
 <hr style="width: 100%; height: 2px;">
 <vaadin-vertical-layout style="align-self: center; flex-grow: 0; align-items: center; z-index: 2; justify-content: flex-start; padding: 0%; margin: 0%;" id="listaTopHashtag" theme="spacing-xs"></vaadin-vertical-layout>
 <hr style="width: 100%; height: 2px;">
 <vaadin-button style="align-self: center; z-index: 2; " id="botonVerListaHashtag" theme="primary contrast">
   Lista Hashtags 
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
