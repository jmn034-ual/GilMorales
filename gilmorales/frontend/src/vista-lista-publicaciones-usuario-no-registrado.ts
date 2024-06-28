import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista-publicaciones-usuario-no-registrado')
export class VistaListaPublicacionesUsuarioNoRegistrado extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="contenedor" style="flex-grow: 0; align-items: center; flex-shrink: 0; overflow-y: auto; z-index: 999; scrollbar-width: thin; scrollbar-color: transparent transparent; width: 100%; padding-bottom: 5%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="select" style="align-self: flex-end; margin-right: var(--lumo-space-xl); z-index: 99999; margin-top: var(--lumo-space-xl);"></vaadin-horizontal-layout>
 <vaadin-vertical-layout style="flex-grow: 0; align-items: center; flex-shrink: 0; overflow-y: auto; z-index: 999; scrollbar-width: thin; scrollbar-color: transparent transparent; width: 100%; padding-bottom: 5%;" id="layoutPublicacionesUNR"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
