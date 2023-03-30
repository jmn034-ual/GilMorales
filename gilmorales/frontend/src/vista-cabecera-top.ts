import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-cabecera';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="layoutCabecera" style="width: 100%;">
  <vista-cabecera id="vistaCabecera" style="flex-grow: 1;"></vista-cabecera>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="flex-grow: 1; align-self: stretch;">
  <vaadin-vertical-layout id="cabeceraTop" style="margin: var(--lumo-space-xl);">
   <h3 id="tituloUsuarios" style="align-self: center;">Top Usuarios</h3>
   <vaadin-vertical-layout theme="spacing" id="listaUsuarios" style="align-self: center; flex-grow: 1;"></vaadin-vertical-layout>
   <vaadin-button id="botonVerListaUsuarios" style="align-self: center;">
    Ver Lista Usuarios
   </vaadin-button>
   <h3 style="align-self: center;" id="tituloHashtag">Top Hashtags</h3>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 1;" id="listaTopHashtag"></vaadin-vertical-layout>
   <vaadin-button style="align-self: center;" id="botonVerListaHashtag">
    Ver Lista Hashtags
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutPublicaciones" style="flex-grow: 1;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
