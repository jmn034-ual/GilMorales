import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="flex-grow: 0; align-items: flex-start; flex-shrink: 0; overflow-y: auto; z-index: 999; scrollbar-width: thin; scrollbar-color: transparent transparent; width: 100%; padding-bottom: var(--lumo-space-xl); height: 100%; padding-top: var(--lumo-space-xl);" id="layoutPublicacionesUNR"></vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
