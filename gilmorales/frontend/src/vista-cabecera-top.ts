import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout id="cabeceraTop" style="flex-shrink: 0; flex-grow: 0; align-items: center; z-index: 999; height: 100%; justify-content: flex-start; overflow-y: auto; scrollbar-color: transparent transparent; padding-bottom: 5%; background-color: #C8C4C4; padding: var(--lumo-space-m); " theme="spacing-xs">
 <h4 id="tituloUsuarios">Top Usuarios</h4>
 <vaadin-vertical-layout id="listaUsuarios" style="flex-grow: 0; z-index: 2; align-items: center; padding: 0%; margin: 0%;" theme="spacing-xs"></vaadin-vertical-layout>
 <vaadin-button id="botonVerListaUsuarios" style="align-self: center;z-index: 2; background-color: #ffffff;">
  Lista Usuarios
 </vaadin-button>
 <h4 id="tituloHashtag">Top Hashtags</h4>
 <vaadin-vertical-layout style="align-self: center; flex-grow: 0; align-items: center; z-index: 2; justify-content: flex-start; padding: 0%; margin: 0%;" id="listaTopHashtag"></vaadin-vertical-layout>
 <vaadin-button style="align-self: center; z-index: 2; background-color: #ffffff;" id="botonVerListaHashtag">
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
